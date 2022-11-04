package mnl.senn.proje.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;
    private Integer stockCode;
    private String productName;
    private String description;
    private Integer pieces;
    private Double totelPrice;


    @ManyToOne
    private Category category;
}