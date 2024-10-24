package com.example.moduleb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class FailingTest {

   @Test
   void fails() {
     fail();
   }

}
