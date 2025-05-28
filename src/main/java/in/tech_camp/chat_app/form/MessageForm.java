package in.tech_camp.chat_app.form;

import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MessageForm {
  // @NotBlank(message = "Name can't be blank",groups = ValidationPriority1.class) 　削除
  private String content;

  private MultipartFile image;

  public void validateMessage(BindingResult result) {
    if ((content == null || content.isEmpty()) && (image == null || image.isEmpty())) {
      result.rejectValue("Content", "error.Message", "Please enter either content or image");
    }
  }
}