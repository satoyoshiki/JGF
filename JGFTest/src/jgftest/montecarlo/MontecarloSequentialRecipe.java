package jgftest.montecarlo;


import hu.list.tuple.HUTuple1;
import hu.tracer.HUTraceRecipe;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoshiki
 */
@Aspect
public class MontecarloSequentialRecipe extends HUTraceRecipe<HUTuple1<Integer>> {
    public static final Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("JGFTest");    

    
    @Before("call (void jgf.sequential.montecarlo.AppDemo.HUKernel(int)) && args(i)")
    public void beforeHUKernel(int i) {
        //logger.info("sequential {}",i);
        add(new HUTuple1<Integer>(i));
    }

    @Override
    protected HUTraceRecipe<HUTuple1<Integer>>[] friends() {
        return new HUTraceRecipe[]{};
    }
    
}
