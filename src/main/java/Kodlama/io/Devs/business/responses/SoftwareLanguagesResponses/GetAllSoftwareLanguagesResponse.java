package Kodlama.io.Devs.business.responses.SoftwareLanguagesResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSoftwareLanguagesResponse {
    private int id;
    private String name;
    private List<String> technologyNames;
}
