package myblog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class fruitshop{

private int fruitnumber;
private String fruit;
private String kind;
private int price;
private int sales;

}
