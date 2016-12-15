package class_40_jdbc_and_lamba.s3;
import class_32_chario.User;

@FunctionalInterface
public interface UserFK {

	User test(String username,String password);
}
