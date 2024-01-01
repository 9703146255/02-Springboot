package win.thiru;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ReportController {
	
	public ReportController() {
		System.out.println("ReportController:: constructor..");
	}

}
