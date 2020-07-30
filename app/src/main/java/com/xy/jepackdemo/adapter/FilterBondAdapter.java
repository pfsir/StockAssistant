package com.xy.jepackdemo.adapter;

import com.xy.baselib.adapter.BaseDBRVAdapter;
import com.xy.jepackdemo.BR;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.bean.FilterBondBean;
import com.xy.jepackdemo.databinding.ItemChoiceBondCellLayoutBinding;

/**
 * @author libo
 * @date 2019/3/10.
 * description
 */
public class FilterBondAdapter extends BaseDBRVAdapter<FilterBondBean.RowsBean.CellBean, ItemChoiceBondCellLayoutBinding> {

    public FilterBondAdapter() {
        super(R.layout.item_choice_bond_cell_layout, BR.bean);
    }
}
