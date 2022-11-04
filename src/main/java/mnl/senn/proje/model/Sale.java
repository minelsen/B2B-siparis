package mnl.senn.proje.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SaleId;
    private String saleTime;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Category category;

    @ManyToOne
    private StockCard stockCard;

}
