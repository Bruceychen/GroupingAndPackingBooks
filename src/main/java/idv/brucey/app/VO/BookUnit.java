package idv.brucey.app.VO;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookUnit {
    private String bookName;
    private String bookEpisode;
    private BigDecimal weightGram;

    public BookUnit(String bookinfo) {
        // singleBookInfo = "bookname,episode,weightGram"
        String[] meta = bookinfo.split(",");
        this.bookName = meta[0];
        this.bookEpisode = meta[1];
        this.weightGram = new BigDecimal(meta[2]);
    }
}