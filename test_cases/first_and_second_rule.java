// Lines 7 & 10 are deleted when the edge is global
package com.atlassian.rdbms.dbimportexport.runner.impl;

import com.a.b.c.RolloutFlag;

class SandboxHashFinder {
    static final RolloutFlag FLAG_TO_DELETE = new RolloutFlag("TEST_FF_KEY");

    public String foo(String test) {
        bar(FLAG_TO_DELETE);
    }
}