package efub.ebs.ebs01.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NoticeDTO {
    private int id;
    private String title;
    private String description;
}

