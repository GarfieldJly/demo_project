package com.garfield.function.controller;

import com.garfield.function.config.AsyncJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author jingliyuan
 * @date 2021/2/2
 */
@RestController
@RequestMapping("/async")
public class AsyncController {
    @Autowired
    private AsyncJob asyncJob;

    @GetMapping("/getNum")
    public String getNum(){
        asyncJob.printNum();
        return "SUCCESS";
    }

    @GetMapping("/getFutureNum")
    public String getFutureNum() throws ExecutionException, InterruptedException {
        Future<String> numResult = asyncJob.getNumResult();
        while (true){
            if(numResult.isDone()){
                System.out.println( numResult.get());
                break;
            }
            TimeUnit.SECONDS.sleep(1);
        }
        return "SUCCESS";
    }


    public static void main(String[] args) {
//        List<String> lst2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill","Dany","Julia","Jenish","Divya");
//        Optional<String> j = lst2.stream().filter(s -> s.startsWith("J")).findAny();
//        System.out.println(j.get());

        System.out.println(IntStream.range(0, 100).parallel().findAny());
    }

}
