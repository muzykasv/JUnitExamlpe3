package mainacad.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SuiteTest1.class,
        SuiteTest2.class,
})


public class JUnitTest {
    // Этот класс остается пустым, он используется только как держатель для вышеупомянутых аннотаций
}
