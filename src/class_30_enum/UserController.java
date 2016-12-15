package class_30_enum;
public class UserController {
	
	@RequestMapping(value = {"/user","/user/index"},method = ReuquestMethod.POST)
	public  String index(){
		return "success";
	}
}
