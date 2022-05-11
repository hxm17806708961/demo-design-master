package com.hxm.design.demo.service.engine;

import com.hxm.design.demo.model.EngineResult;
import com.hxm.design.demo.model.aggregates.TreeRich;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/11 18:06
 */
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich
            treeRich, final Map<String, String> decisionMatter);
}
