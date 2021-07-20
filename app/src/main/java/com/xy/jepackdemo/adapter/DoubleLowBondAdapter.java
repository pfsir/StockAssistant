package com.xy.jepackdemo.adapter;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.DoubleLowBondBean;
import com.xy.jepackdemo.databinding.ItemDoubleLowBondCellLayoutBinding;

/**
 * @author ouyangpengfei
 * @date 2021/7/19.
 * description
 */
public class DoubleLowBondAdapter extends BaseDBRVAdapter<DoubleLowBondBean.RowsBean.CellBean, ItemDoubleLowBondCellLayoutBinding> {

    public DoubleLowBondAdapter() {
        super(R.layout.item_double_low_bond_cell_layout, BR.bean);
    }
}
