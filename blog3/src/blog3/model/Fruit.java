package blog3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fruit {
private int fruitnumber;
private String name;
private String kind;
private int price;
private int sales;
}
