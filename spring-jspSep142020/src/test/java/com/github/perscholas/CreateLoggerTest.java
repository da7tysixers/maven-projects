package com.github.perscholas;


import org.junit.Test;



import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateLoggerTest {
    private static Logger logger = Logger.getLogger(CreateLoggerTest.class.getName());
    
    @Test
    public void loggerTest(){
        //Given
        
        
        //When
        
        logger.log(Level.INFO, "Hey check out the information I'm logging!");
        
        //Then

    }}
