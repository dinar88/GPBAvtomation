package ASettings;

import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

import java.util.List;

@RunWith(Suite.class)

@Suite.SuiteClasses({AndroidPolkascan.class, AndroidSubscan.class})


public class TestCases1 {
}

//public class TestCases1 {
//    Class[] cls = { AndroidSubscan.class };
//    Result result = JUnitCore.runClasses(ParallelComputer.classes(), cls);
//    List<Failure> failures = result.getFailures();
//}