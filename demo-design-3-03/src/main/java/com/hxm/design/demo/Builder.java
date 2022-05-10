package com.hxm.design.demo;

import com.hxm.design.demo.ceilling.LevelOneCeiling;
import com.hxm.design.demo.ceilling.LevelTwoCeiling;
import com.hxm.design.demo.coat.DuluxCoat;
import com.hxm.design.demo.coat.LiBangCoat;
import com.hxm.design.demo.floor.ShengXiangFloor;
import com.hxm.design.demo.tile.DongPengTile;
import com.hxm.design.demo.tile.MarcoPoloTile;

/**
 * @author hxmao
 * @date 2022/5/10 10:29
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling()) // 吊顶，⼆级顶
                .appendCoat(new DuluxCoat()) // 涂料，多乐⼠
                .appendFloor(new ShengXiangFloor()); // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢⽥园")
                .appendCeiling(new LevelTwoCeiling()) // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat()) // 涂料，⽴邦
                .appendTile(new MarcoPoloTile()); // 地砖，⻢可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling()) // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat()) // 涂料，⽴邦
                .appendTile(new DongPengTile()); // 地砖，东鹏
    }
}
