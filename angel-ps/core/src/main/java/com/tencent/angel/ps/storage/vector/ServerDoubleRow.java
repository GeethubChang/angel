/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.tencent.angel.ps.storage.vector;

import com.tencent.angel.ml.math2.vector.DoubleVector;
import com.tencent.angel.ml.math2.utils.RowType;
import com.tencent.angel.ps.storage.vector.func.DoubleElemUpdateFunc;

public abstract class ServerDoubleRow extends ServerRow {
  public ServerDoubleRow(int rowId, RowType rowType, long startCol, long endCol, int estElemNum,
    DoubleVector innerRow) {
    super(rowId, rowType, startCol, endCol, estElemNum, innerRow);
  }

  public abstract void elemUpdate(DoubleElemUpdateFunc func);
}
