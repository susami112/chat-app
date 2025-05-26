package in.tech_camp.chat_app.form;

import in.tech_camp.chat_app.validation.ValidationPriority1;        // Email形式のバリデーション用
import in.tech_camp.chat_app.validation.ValidationPriority2;    // 空白禁止のバリデーション用
import jakarta.validation.constraints.Email; // バリデーションのグループ1
import jakarta.validation.constraints.NotBlank; // バリデーションのグループ2
import lombok.Data;

@Data
public class UserEditForm {
  
  private Integer id;  // ユーザーID（編集時に必要なので保持）

  // 名前が空白の場合、エラーメッセージを出す設定
  // ValidationPriority1グループのバリデーションとして実行される
  @NotBlank(message = "Name can't be blank", groups = ValidationPriority1.class)
  private String name;

  // メールアドレスが空白の場合のエラー
  // ValidationPriority1グループでチェック
  @NotBlank(message = "Email can't be blank", groups = ValidationPriority1.class)
  // メールアドレスの形式が正しくない場合のエラー
  // ValidationPriority2グループでチェック
  @Email(message = "Email should be valid", groups = ValidationPriority2.class)
  private String email;
}