package netology;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DataGeneratorForm {
    private final String city;
    private final String name;
    private final String phone;
}
