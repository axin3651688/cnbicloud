import java.nio.charset.Charset;
import java.util.Base64;
import com.cnbicloud.tools.CnbiConstants;
public class PasswordEncodingTest {

	public static void main(String[] args) {
		
		String username = CnbiConstants.PROVIDER_USER ;
		String password = CnbiConstants.PROVIDER_PWD ;//authHeader==Basic bWxkbmphdmE6aGVsbG8=
		
		 username ="cnbigjx";
		 password ="1234456";//authHeader==Basic Y25iaWdqeDoxMjM0NDU2
		String auth = username + ":" + password;//认证的原始信息
		byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
		// 在进行授权的头信息内容配置的时候加密的信息一定要与“Basic”之间有一个空格
		String authHeader = "Basic " + new String(encodedAuth);
		System.out.println("authHeader=="+authHeader);
		
		// byte[] ss = authHeader.getBytes(Charset.forName("US-ASCII"));
		 byte[] dcdoes = Base64.getDecoder().decode(encodedAuth);
		 System.out.println(new String(dcdoes));

	}

}
