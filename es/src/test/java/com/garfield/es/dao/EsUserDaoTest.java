package com.garfield.es.dao;

import com.garfield.es.bean.EsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jingliyuan
 * @date 2020/12/24
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@EnableElasticsearchRepositories(basePackages = "com.garfield.es.dao")
public class EsUserDaoTest {
    @Autowired
    private EsUserDao esUserDao;
    @Test
    public void init(){
        esUserDao.deleteAll();
        esUserDao.save(new EsUser("1","cat","female"));
        esUserDao.save(new EsUser("2","dog","female"));
        esUserDao.save(new EsUser("3","ox","male"));
    }

    @Test
    public void find(){
        Pageable pageable = PageRequest.of(0, 20);
        Page<EsUser> cat = esUserDao.findEsUserByName("cat", pageable);
        System.out.println(cat.getContent().size());
    }

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void add(){
        EsUser esUser = new EsUser("4","monkey","female");
        IndexQuery indexQuery = new IndexQueryBuilder().withObject(esUser).withIndexName("bb").withType("zoo").build();
        elasticsearchTemplate.index(indexQuery);
    }

    @Test
    public void select(){
        CriteriaQuery criteriaQuery = new CriteriaQuery(new Criteria().and(new Criteria("name").is("cat")));
        EsUser esUser = elasticsearchTemplate.queryForObject(criteriaQuery, EsUser.class);
        System.out.println(esUser.toString());
    }

}
