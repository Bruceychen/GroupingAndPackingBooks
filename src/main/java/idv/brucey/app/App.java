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
                new BookSet("33歲單身女騎士隊長,2,216.3"),
                new BookSet("刀剑神域 女孩任务,1,225.9"),
                new BookSet("刀剑神域 女孩任务,2,188.1"),
                new BookSet("刀剑神域 女孩任务,3,200"),
                new BookSet("刀剑神域 女孩任务,4,225.2"),
                new BookSet("刀剑神域 女孩任务,5,172.2"),
                new BookSet("刀剑神域 女孩任务,6,229"),
                new BookSet("刀剑神域 女孩任务,7,200.2"),
                new BookSet("刀剑神域 女孩任务,8,217.9"),
                new BookSet("大正处女御伽话,1,179.1"),
                new BookSet("大正处女御伽话,3,175.9"),
                new BookSet("大正处女御伽话,4,180.4"),
                new BookSet("小林家的龙女仆 艾玛的OL日记,2,159.8"),
                new BookSet("小林家的龙女仆 艾玛的OL日记,3,157.3"),
                new BookSet("不对称的连理,6,215.6"),
                new BookSet("不要欺負我，長瀞同學 首刷,11,182"),
                new BookSet("不谈感情的关系,3,220"),
                new BookSet("少女之愛：台灣ACG界百合迷文化發展史 2023增修版,1,431.1"),
                new BookSet("少女同志，向敵人開槍吧,1,726.5"),
                new BookSet("少年的初恋是美少女,1,219.6"),
                new BookSet("少年的深渊,10,235.5"),
                new BookSet("她的唇 他的吻,1,355.6"),
                new BookSet("异世界药局,1,374.6"),
                new BookSet("异世界药局,2,346"),
                new BookSet("异世界药局,4,333.4"),
                new BookSet("异世界药局,5,360.7"),
                new BookSet("异世界药局,6,341.3"),
                new BookSet("两人的独白,5,165.9"),
                new BookSet("我的身体好像天下无敌 首刷版,5,408.1"),
                new BookSet("我們相愛的機率是12%,1,452.2"),
                new BookSet("我當備胎女友也沒關係,3,310.9"),
                new BookSet("我當備胎女友也沒關係,4,293.8"),
                new BookSet("我當備胎女友也沒關係,5,290"),
                new BookSet("身為菁英天使的我，為難以攻陷的JK傷透腦筋,2,161.9"),
                new BookSet("身為菁英天使的我，為難以攻陷的JK傷透腦筋,1,180.5"),
                new BookSet("身為菁英天使的我，為難以攻陷的JK傷透腦筋,3,172.6"),
                new BookSet("身為魔王的我娶了奴隸精靈為妻 首刷,10,369.6"),
                new BookSet("身為魔王的我娶了奴隸精靈為妻 首刷,11,398.7"),
                new BookSet("身為魔王的我娶了奴隸精靈為妻 首刷,12,396.9"),
                new BookSet("身為魔王的我娶了奴隸精靈為妻 首刷,9,405.9"),
                new BookSet("身為魔王的我娶了奴隸精靈為妻,15,372.4"),
                new BookSet("兩人的獨白,4,165.3"),
                new BookSet("兩人的獨白,6,181.7"),
                new BookSet("单人房、日照一般丶附天使,1,206.1"),
                new BookSet("姊姊,6,133.9"),
                new BookSet("姊姊与巨人,2,160.6"),
                new BookSet("姊姊与巨人,3,174.6"),
                new BookSet("姊嫁物语,14,215"),
                new BookSet("勇者死了,1,211"),
                new BookSet("勇者死了,10,207.5"),
                new BookSet("勇者死了,11,211.7"),
                new BookSet("勇者死了,12,210.2"),
                new BookSet("勇者死了,13,221.7"),
                new BookSet("勇者死了,14,207"),
                new BookSet("勇者死了,15,207"),
                new BookSet("勇者死了,16,204.7"),
                new BookSet("勇者死了,2,210.9"),
                new BookSet("勇者死了,3,210.5"),
                new BookSet("勇者死了,4,221.2"),
                new BookSet("勇者死了,5,205.3"),
                new BookSet("勇者死了,6,215.8"),
                new BookSet("勇者死了,7,211.6"),
                new BookSet("勇者死了,8,205.6"),
                new BookSet("勇者死了,9,206.5"),
                new BookSet("英雄教室,10,287.3"),
                new BookSet("貞操逆轉世界的處男邊境領主騎士,1,390"),
                new BookSet("貞操逆轉世界的處男邊境領主騎士,2,370.8"),
                new BookSet("終將成為你 關於佐伯,1,277.3"),
                new BookSet("終將成為你 關於佐伯,2,270.6"),
                new BookSet("終將成為你 關於佐伯,3,297.6"),
                new BookSet("喜欢的偶像居然变成了公认的跟踪狂,1,148.6"),
                new BookSet("喜欢的偶像居然变成了公认的跟踪狂,2,144.7"),
                new BookSet("喜欢的偶像居然变成了公认的跟踪狂,3,143.1"),
                new BookSet("喜欢的偶像居然变成了公认的跟踪狂,4,145.3"),
                new BookSet("喜欢的偶像居然变成了公认的跟踪狂,5,145.3"),
                new BookSet("朝姊,1,164.8"),
                new BookSet("朝姊,2,159.4"),
                new BookSet("朝姊,3,158.5"),
                new BookSet("朝姊,4,157.5"),
                new BookSet("朝姊,5,158.5"),
                new BookSet("朝姊,6,147.1"),
                new BookSet("朝姊,7,179.3"),
                new BookSet("發條精靈戰記 天鏡的極北之星,14,398"),
                new BookSet("菜鸟炼金术师营业中,1,342"),
                new BookSet("菜鸟炼金术师营业中,2,368"),
                new BookSet("菜鸟炼金术师营业中,3,332"),
                new BookSet("菜鸟炼金术师营业中,4,348.4"),
                new BookSet("菜鸟炼金术师营业中,5,336.1"),
                new BookSet("菜鸟炼金术师营业中,6,367.6"),
                new BookSet("超超超超超喜歡你的１００個女朋友,1,223.2"),
                new BookSet("超超超超超喜歡你的１００個女朋友,2,225.9"),
                new BookSet("超超超超超喜歡你的１００個女朋友,3,218.8"),
                new BookSet("敬啟者：我與殺手小姐結婚了,2,135"),
                new BookSet("敬啟者：我與殺手小姐結婚了,3,140.3"),
                new BookSet("敬啟者：我與殺手小姐結婚了,4,141"),
                new BookSet("誰叫她今天不在身邊,2,225"),
                new BookSet("轉生公主與天才千金的魔法革命,1,180.2"),
                new BookSet("轉生公主與天才千金的魔法革命,2,177.3"),
                new BookSet("轉生公主與天才千金的魔法革命,3,190.6"),
                new BookSet("轉生公主與天才千金的魔法革命,4,171.7"),
                new BookSet("轉生公主與天才千金的魔法革命,5,177"),
                new BookSet("魔弹之王与战姬,1,307.7"),
                new BookSet("讓聲稱女性之間不可能的女孩，在百日內徹底淪陷的百合故事,1,178.9")
        };
        List<BookSet> unGroupBookSetList = new ArrayList<>(Arrays.stream(bookSets).toList());
        groupedBookSetList1 = calculate1(unGroupBookSetList);
//        groupedBookSetList1.stream()
//                .map(BookSet::getBookUnitList)
//                .forEach(System.out::println);
        printBookSetList(groupedBookSetList1);
    }

    public static void printBookSetList(List<BookSet> bookSetList) {
        for (BookSet bookSet : bookSetList) {
            bookSet.getBookUnitList().stream()
                    .forEach(bookUnit -> {
                        System.out.println(bookUnit.getBookName()+", "+bookUnit.getBookEpisode()+", "+bookUnit.getWeightGram());
                    });
            System.out.println();
        }
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
