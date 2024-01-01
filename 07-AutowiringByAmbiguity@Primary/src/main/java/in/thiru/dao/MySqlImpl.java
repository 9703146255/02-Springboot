package in.thiru.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MySqlImpl implements IUserDao {

	@Override
	public String findNameById(Integer id) {

		if (id == 100) {
			return "thiru";
		} else if (id == 200) {
			return "kiran";
		}

		return null;
	}

}
