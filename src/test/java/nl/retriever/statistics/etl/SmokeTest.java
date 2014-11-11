package nl.retriever.statistics.etl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scriptella.driver.spring.EtlExecutorBean;
import scriptella.execution.EtlExecutorException;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/smoketest-application-context.xml" })
public class SmokeTest {

	@Autowired
	private ApplicationContext appCtx;

	@Test
	public void testCreateAndPopulateDb() throws EtlExecutorException {

		EtlExecutorBean executor = appCtx.getBean("populateDb", EtlExecutorBean.class);
		executor.execute();
	}

}
