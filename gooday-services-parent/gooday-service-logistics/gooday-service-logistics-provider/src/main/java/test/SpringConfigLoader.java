package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/spring/provider.xml"})
@Transactional
public class SpringConfigLoader {

	public SpringConfigLoader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
