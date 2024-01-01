package in.ashokit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
////in.ashokit.ReportDAO
@Component
@Scope("prototype")
public class ReportDAO {

	public ReportDAO() 
	{
		System.out.println("ReportDAO :: Constructor");
	}

}
