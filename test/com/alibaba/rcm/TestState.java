/*
 * Copyright (c) 2020 Alibaba Group Holding Limited. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. Alibaba designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */

/*
 * @test
 * @summary Test get tenant state
 * @library /lib/testlibrary
 * @run main TestState
 */

import com.alibaba.rcm.ResourceContainer;
import demo.MyResourceFactory;

import java.util.Collections;

import static jdk.testlibrary.Asserts.*;


public class TestState {
    public static void main(String[] args) {
        ResourceContainer rc = MyResourceFactory.INSTANCE.createContainer(Collections.emptyList());
        assertEQ(rc.getState(), ResourceContainer.State.RUNNING);
        rc.destroy();
        assertEQ(rc.getState(), ResourceContainer.State.DEAD);
    }
}
