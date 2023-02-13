package simplechatting2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
	private String resource;
	private String status;	//status == code
	private String body;
}
