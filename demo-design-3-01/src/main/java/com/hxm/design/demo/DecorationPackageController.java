package com.hxm.design.demo;

import com.hxm.design.demo.ceilling.LevelOneCeiling;
import com.hxm.design.demo.ceilling.LevelTwoCeiling;
import com.hxm.design.demo.coat.DuluxCoat;
import com.hxm.design.demo.coat.LiBangCoat;
import com.hxm.design.demo.floor.ShengXiangFloor;
import com.hxm.design.demo.tile.DongPengTile;
import com.hxm.design.demo.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hxmao
 * @date 2022/5/10 9:35
 */

public class DecorationPackageController {

    public String getMatterList(BigDecimal area, Integer level) {

        List<Matter> list = new ArrayList<>();

        BigDecimal price = BigDecimal.ZERO;

        if (1 == level){
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();

            DuluxCoat duluxCoat = new DuluxCoat();

            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();

            list.add(levelTwoCeiling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);

            price = price.add(area.multiply(new BigDecimal(0.2)).multiply(levelTwoCeiling.price()));

            price = price.add(area.multiply(new BigDecimal(1.4)).multiply(duluxCoat.price()));

            price = price.add(area.multiply(shengXiangFloor.price()));

        }



        // 轻奢⽥园
        if (2 == level) {
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);
            price = price.add(area.multiply(new
                    BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new
                    BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }
        // 现代简约
        if (3 == level) {
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            DongPengTile dongPengTile = new DongPengTile();
            list.add(levelOneCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);
            price = price.add(area.multiply(new
                    BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new
                    BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }


        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                        "套餐等级：" + level + "\r\n" +
                        "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) +
                        " 元\r\n" +
                        "房屋⾯积：" + area.doubleValue() + " 平⽶\r\n" +
                        "材料清单：\r\n");
        for (Matter matter: list) {

            detail.append(matter.scene()).append("：").append(matter.brand()).append(
                    "、").append(matter.model()).append("、平⽶价格：").append(matter.price()).append(" 元。\n");
        }
        return detail.toString();


    }
}
