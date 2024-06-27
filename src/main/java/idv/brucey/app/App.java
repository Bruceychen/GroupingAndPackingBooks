package idv.brucey.app;

import idv.brucey.app.VO.BookSet;
import idv.brucey.app.VO.BookUnit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<BookSet> groupedBookSetList1;

        BookSet[] bookSets = {
            new BookSet("博兒的東瀛紀行,5,186.7", "博兒的東瀛紀行,8,187.1", "博兒的東瀛紀行,10,196.8"),
            new BookSet("博兒的東瀛紀行,3,184.3", "博兒的東瀛紀行,4,185.5", "博兒的東瀛紀行,6,199.5", "博兒的東瀛紀行,7,201.2", "博兒的東瀛紀行,9,184.3"),
            new BookSet("聽見向陽之聲 春夏秋冬 特裝版,2,522.0"),
            new BookSet("結緣甘神神社,1,171.4"),
            new BookSet("結緣甘神神社,2,163.4"),
            new BookSet("結緣甘神神社,3,180.0"),
            new BookSet("25次元誘惑,4,190.0"),
            new BookSet("25次元誘惑,5,195.0"),
            new BookSet("25次元誘惑,6,197.3"),
            new BookSet("25次元誘惑,7,204.1"),
            new BookSet("25次元誘惑,8,191.9"),
            new BookSet("25次元誘惑,9,197.9"),
            new BookSet("25次元誘惑,10,189.0"),
            new BookSet("25次元誘惑,11,189.0"),
            new BookSet("男裝女孩與嬌嬌女,2,285.7"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師限定版,11,322.3"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師限定版,12,323.4"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師,6,249.5"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師限定版,7,335.2"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師限定版,8,365.2"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師限定版,9,251.2"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師限定版,10,338.7"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師,1,257.0"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師,2,245.3"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師,3,264.8"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師,4,256.0"),
            new BookSet("如果三十歲還是處男似乎可以成為魔法師限定版,5,279.6"),
        };
        List<BookSet> unGroupBookSetList = new ArrayList<>(Arrays.stream(bookSets).toList());
        groupedBookSetList1 = calculate1(unGroupBookSetList);
        System.out.println(groupedBookSetList1);
    }

    public static List<BookSet> calculate2(List<BookSet> ungroupList) {
        // Initialize an empty list to store the grouped book sets
        List<BookSet> groupedBookSetList = new ArrayList<>();

        // Sort the ungrouped book sets by the total weight of their book units in descending order
        ungroupList.sort((a, b) -> {
            BigDecimal totalWeightA = a.getBookUnitList().stream().map(BookUnit::getWeightGram).reduce(BigDecimal::add).get();
            BigDecimal totalWeightB = b.getBookUnitList().stream().map(BookUnit::getWeightGram).reduce(BigDecimal::add).get();
            return totalWeightB.compareTo(totalWeightA);
        });

        // Iterate through the sorted ungrouped book sets
        for (BookSet ungroupedBookSet : ungroupList) {
            // Create a new grouped book set
            BookSet groupedBookSet = new BookSet();
            groupedBookSetList.add(groupedBookSet);

            // Iterate through the book units in the ungrouped book set
            for (BookUnit bookUnit : ungroupedBookSet.getBookUnitList()) {
                // Check if adding the current book unit to the grouped book set would exceed the weight limit
                BigDecimal currentWeight = groupedBookSet.getBookUnitList().stream().map(BookUnit::getWeightGram).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
                if (currentWeight.add(bookUnit.getWeightGram()).compareTo(BigDecimal.valueOf(1580)) <= 0) {
                    // Add the current book unit to the grouped book set
                    groupedBookSet.getBookUnitList().add(bookUnit);
                } else {
                    // Break out of the loop if adding the current book unit would exceed the weight limit
                    break;
                }
            }
        }

        return groupedBookSetList;
    }

    public static List<BookSet> calculate1(List<BookSet> ungroupList) {
        List<BookUnit> allBookUnits = new ArrayList<>();
        for (BookSet bookSet : ungroupList) {
            allBookUnits.addAll(bookSet.getBookUnitList());
        }

        List<BookSet> result = new ArrayList<>();
        BookSet currentSet = new BookSet();
        currentSet.setBookUnitList(new ArrayList<>());

        BigDecimal maxWeight = new BigDecimal(1580);
        BigDecimal currentWeight = BigDecimal.ZERO;

        for (BookUnit bookUnit : allBookUnits) {
            BigDecimal unitWeight = bookUnit.getWeightGram();
            if (currentWeight.add(unitWeight).compareTo(maxWeight) <= 0) {
                currentSet.getBookUnitList().add(bookUnit);
                currentWeight = currentWeight.add(unitWeight);
            } else {
                result.add(currentSet);
                currentSet = new BookSet();
                currentSet.setBookUnitList(new ArrayList<>());
                currentSet.getBookUnitList().add(bookUnit);
                currentWeight = unitWeight;
            }
        }

        if (!currentSet.getBookUnitList().isEmpty()) {
            result.add(currentSet);
        }

        return result;
    }
}
