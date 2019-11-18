package com.rulesHello;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.text.ParseException;

public class RulesHello {
    public static void main(String[] args) throws ParseException {
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("testhelloworld");
        int count = ks.fireAllRules();
        System.out.println("总执行了" + count + "条规则");
        ks.dispose();
    }
}

