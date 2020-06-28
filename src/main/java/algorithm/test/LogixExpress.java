package main.java.algorithm.test;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.List;

import static java.lang.System.out;

public class LogixExpress {

    public static void main(String[] args) throws Exception {
"a".hashCode();
        out.println("a".hashCode());
        out.println("b".hashCode());
           text() ;

//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("js");
//        engine.put("a",true);
//        engine.put("b",false);
//        engine.put("c",true);
//
//        String str = "((a or b) and c)==true";
//        str = str.replaceAll("or", "||");
//        str = str.replaceAll("and", "&&");
//        out.println(str);
//
//        Object result = engine.eval(str);
//        out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);

    }




    private static void text() {


        final ScriptEngineManager mgr = new ScriptEngineManager();
        for(ScriptEngineFactory fac: mgr.getEngineFactories()) {
            System.out.println(String.format("%s (%s), %s (%s), %s", fac.getEngineName(),
                    fac.getEngineVersion(), fac.getLanguageName(),
                    fac.getLanguageVersion(), fac.getParameter("THREADING")));
        }


    }
}
