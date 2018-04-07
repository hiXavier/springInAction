package com.chapter18.prac.clone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/3/10
 */
public class AcademyTest {
    @Before
    public void setUp() throws Exception {
        Academy academy = new Academy();
        academy.setAcademyName("软件学院");
        academy.setAcademyNo(23);
        Specialty specialty = new Specialty();
        specialty.setSpecialtyName("软件工程");
        specialty.setSpecialtyNo(1);

        Academy academyClone = (Academy)academy.clone();
        academyClone.setAcademyNo(24);
        Specialty specialty2 = academyClone.getSpecialty();
        specialty2.setSpecialtyName("计算机科学与技术");
        specialty2.setSpecialtyNo(2);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testModify(){

    }

}