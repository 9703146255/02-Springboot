package win.thiru;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//win.thiru.ReportController


@Component
@Scope("prototype")
public class ReportController {
	
	public ReportController() {
		System.out.println("ReportController:: constructor..");
	}

}
