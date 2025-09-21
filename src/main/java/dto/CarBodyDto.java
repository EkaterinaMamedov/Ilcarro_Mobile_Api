package dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarBodyDto {
    private String sNumber;
    private String manufacture;
    private String model;
    private String city;
    private Double price;
    private String carClass;
    private Integer year;
    private Integer seats;
    private String about;
}
