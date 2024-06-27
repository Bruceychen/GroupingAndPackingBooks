package idv.brucey.app.VO;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookSet {
    private List<BookUnit> bookUnitList;

    public BookSet(String... bookInfos) {
        List<BookUnit> meatList = new ArrayList<>();
        // singleBookInfo = "bookname,episode,weightGram"
        for (String bookinfo : bookInfos) {
            meatList.add(new BookUnit(bookinfo));
        }
        this.bookUnitList = meatList;
    }
}

