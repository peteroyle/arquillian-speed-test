package com.example.test;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jboss.shrinkwrap.api.spec.WebArchive;

@RunWith(Arquillian.class)
public class HelloLocalBeanTest {

    @Inject
    private HelloLocal hellolocal;

    @Deployment(name = "test.war")
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addPackage(HelloLocalBean.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void test01() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test02() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test03() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test04() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test05() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test06() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test07() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test08() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test09() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test10() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test11() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test12() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test13() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test14() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test15() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test16() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test17() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test18() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test19() {
        Assert.assertNotNull(hellolocal);
    }

    @Test
    public void test20() {
        Assert.assertNotNull(hellolocal);
    }
}
