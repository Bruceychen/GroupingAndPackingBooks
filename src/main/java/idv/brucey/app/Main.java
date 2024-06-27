package com.carrefour.apimanagement;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cal {
    public static void main(String[] args) {
        List<BookSet> unGroupBookSetList = new ArrayList<>();
        List<BookSet> groupedBookSetListGemini = new ArrayList<>();
        List<BookSet> groupedBookSetListChatGpt = new ArrayList<>();

        BookSet set01 = new BookSet();
        BookSet set02 = new BookSet();
        BookSet set03 = new BookSet();
        BookSet set04 = new BookSet();
        BookSet set05 = new BookSet();
        BookSet set06 = new BookSet();
        BookSet set07 = new BookSet();
        BookSet set08 = new BookSet();
        BookSet set09 = new BookSet();
        BookSet set10 = new BookSet();
        BookSet set11 = new BookSet();
        BookSet set12 = new BookSet();
        BookSet set13 = new BookSet();
        BookSet set14 = new BookSet();
        BookSet set15 = new BookSet();
        BookSet set16 = new BookSet();
        BookSet set17 = new BookSet();
        BookSet set18 = new BookSet();
        BookSet set19 = new BookSet();
        BookSet set20 = new BookSet();
        BookSet set21 = new BookSet();
        BookSet set22 = new BookSet();
        BookSet set23 = new BookSet();
        BookSet set24 = new BookSet();
        BookSet set25 = new BookSet();
        BookSet set26 = new BookSet();
        BookSet set27 = new BookSet();


        List<BookUnit> set01BookUnitList = new ArrayList<>();
        List<BookUnit> set02BookUnitList = new ArrayList<>();
        List<BookUnit> set03BookUnitList = new ArrayList<>();
        List<BookUnit> set04BookUnitList = new ArrayList<>();
        List<BookUnit> set05BookUnitList = new ArrayList<>();
        List<BookUnit> set06BookUnitList = new ArrayList<>();
        List<BookUnit> set07BookUnitList = new ArrayList<>();
        List<BookUnit> set08BookUnitList = new ArrayList<>();
        List<BookUnit> set09BookUnitList = new ArrayList<>();
        List<BookUnit> set10BookUnitList = new ArrayList<>();
        List<BookUnit> set11BookUnitList = new ArrayList<>();
        List<BookUnit> set12BookUnitList = new ArrayList<>();
        List<BookUnit> set13BookUnitList = new ArrayList<>();
        List<BookUnit> set14BookUnitList = new ArrayList<>();
        List<BookUnit> set15BookUnitList = new ArrayList<>();
        List<BookUnit> set16BookUnitList = new ArrayList<>();
        List<BookUnit> set17BookUnitList = new ArrayList<>();
        List<BookUnit> set18BookUnitList = new ArrayList<>();
        List<BookUnit> set19BookUnitList = new ArrayList<>();
        List<BookUnit> set20BookUnitList = new ArrayList<>();
        List<BookUnit> set21BookUnitList = new ArrayList<>();
        List<BookUnit> set22BookUnitList = new ArrayList<>();
        List<BookUnit> set23BookUnitList = new ArrayList<>();
        List<BookUnit> set24BookUnitList = new ArrayList<>();
        List<BookUnit> set25BookUnitList = new ArrayList<>();
        List<BookUnit> set26BookUnitList = new ArrayList<>();
        List<BookUnit> set27BookUnitList = new ArrayList<>();


        set01BookUnitList.add(new BookUnit("博兒的東瀛紀行", "5", new BigDecimal(186.7)));
        set01BookUnitList.add(new BookUnit("博兒的東瀛紀行", "8", new BigDecimal(187.1)));
        set01BookUnitList.add(new BookUnit("博兒的東瀛紀行", "10", new BigDecimal(196.8)));
        set02BookUnitList.add(new BookUnit("博兒的東瀛紀行", "3", new BigDecimal(184.3)));
        set02BookUnitList.add(new BookUnit("博兒的東瀛紀行", "4", new BigDecimal(185.5)));
        set02BookUnitList.add(new BookUnit("博兒的東瀛紀行", "6", new BigDecimal(199.5)));
        set02BookUnitList.add(new BookUnit("博兒的東瀛紀行", "7", new BigDecimal(201.2)));
        set02BookUnitList.add(new BookUnit("博兒的東瀛紀行", "9", new BigDecimal(184.3)));
        set03BookUnitList.add(new BookUnit("聽見向陽之聲 春夏秋冬 特裝版", "2", new BigDecimal(522.0)));
        set04BookUnitList.add(new BookUnit("結緣甘神神社", "1", new BigDecimal(171.4)));
        set05BookUnitList.add(new BookUnit("結緣甘神神社", "2", new BigDecimal(163.4)));
        set06BookUnitList.add(new BookUnit("結緣甘神神社", "3", new BigDecimal(180.0)));
        set07BookUnitList.add(new BookUnit("25次元誘惑", "4", new BigDecimal(190.0)));
        set08BookUnitList.add(new BookUnit("25次元誘惑", "5", new BigDecimal(195.0)));
        set09BookUnitList.add(new BookUnit("25次元誘惑", "6", new BigDecimal(197.3)));
        set10BookUnitList.add(new BookUnit("25次元誘惑", "7", new BigDecimal(204.1)));
        set11BookUnitList.add(new BookUnit("25次元誘惑", "8", new BigDecimal(191.9)));
        set12BookUnitList.add(new BookUnit("25次元誘惑", "9", new BigDecimal(197.9)));
        set13BookUnitList.add(new BookUnit("25次元誘惑", "10", new BigDecimal(189.0)));
        set14BookUnitList.add(new BookUnit("25次元誘惑", "11", new BigDecimal(189.0)));
        set15BookUnitList.add(new BookUnit("男裝女孩與嬌嬌女", "2", new BigDecimal(285.7)));
        set16BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師限定版", "11", new BigDecimal(322.3)));
        set17BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師限定版", "12", new BigDecimal(323.4)));
        set18BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師", "6", new BigDecimal(249.5)));
        set19BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師限定版", "7", new BigDecimal(335.2)));
        set20BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師限定版", "8", new BigDecimal(365.2)));
        set21BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師限定版", "9", new BigDecimal(251.2)));
        set22BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師限定版", "10", new BigDecimal(338.7)));
        set23BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師", "1", new BigDecimal(257.0)));
        set24BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師", "2", new BigDecimal(245.3)));
        set25BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師", "3", new BigDecimal(264.8)));
        set26BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師", "4", new BigDecimal(256.0)));
        set27BookUnitList.add(new BookUnit("如果三十歲還是處男似乎可以成為魔法師限定版", "5", new BigDecimal(279.6)));


        set01.setBookUnitList(set01BookUnitList);
        set02.setBookUnitList(set02BookUnitList);
        set03.setBookUnitList(set03BookUnitList);
        set04.setBookUnitList(set04BookUnitList);
        set05.setBookUnitList(set05BookUnitList);
        set06.setBookUnitList(set06BookUnitList);
        set07.setBookUnitList(set07BookUnitList);
        set08.setBookUnitList(set08BookUnitList);
        set09.setBookUnitList(set09BookUnitList);
        set10.setBookUnitList(set10BookUnitList);
        set11.setBookUnitList(set11BookUnitList);
        set12.setBookUnitList(set12BookUnitList);
        set13.setBookUnitList(set13BookUnitList);
        set14.setBookUnitList(set14BookUnitList);
        set15.setBookUnitList(set15BookUnitList);
        set16.setBookUnitList(set16BookUnitList);
        set17.setBookUnitList(set17BookUnitList);
        set18.setBookUnitList(set18BookUnitList);
        set19.setBookUnitList(set19BookUnitList);
        set20.setBookUnitList(set20BookUnitList);
        set21.setBookUnitList(set21BookUnitList);
        set22.setBookUnitList(set22BookUnitList);
        set23.setBookUnitList(set23BookUnitList);
        set24.setBookUnitList(set24BookUnitList);
        set25.setBookUnitList(set25BookUnitList);
        set26.setBookUnitList(set26BookUnitList);
        set27.setBookUnitList(set27BookUnitList);

        unGroupBookSetList.add(set01);
        unGroupBookSetList.add(set02);
        unGroupBookSetList.add(set03);
        unGroupBookSetList.add(set04);
        unGroupBookSetList.add(set05);
        unGroupBookSetList.add(set06);
        unGroupBookSetList.add(set07);
        unGroupBookSetList.add(set08);
        unGroupBookSetList.add(set09);
        unGroupBookSetList.add(set10);
        unGroupBookSetList.add(set11);
        unGroupBookSetList.add(set12);
        unGroupBookSetList.add(set13);
        unGroupBookSetList.add(set14);
        unGroupBookSetList.add(set15);
                unGroupBookSetList.add(set16);
                unGroupBookSetList.add(set17);
                unGroupBookSetList.add(set18);
                unGroupBookSetList.add(set19);
                unGroupBookSetList.add(set20);
                unGroupBookSetList.add(set21);
                unGroupBookSetList.add(set22);
                unGroupBookSetList.add(set23);
                unGroupBookSetList.add(set24);
                unGroupBookSetList.add(set25);
                unGroupBookSetList.add(set26);
                unGroupBookSetList.add(set27);
//
                groupedBookSetListGemini = Cal.calculateGemini(unGroupBookSetList);
        groupedBookSetListChatGpt = Cal.calculateChatGpt(unGroupBookSetList);

        //        System.out.println(groupedBookSetListGemini);
        System.out.println(groupedBookSetListChatGpt);
    }

    public static List<BookSet> calculateGemini(List<BookSet> ungroupList) {
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

    public static List<BookSet> calculateChatGpt(List<BookSet> ungroupList) {
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


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class BookSet {
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


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class BookUnit {
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