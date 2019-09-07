package com.lionissaja.rxjava;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.stock_item_symbol)
    TextView stockSymbol;

    public StockUpdateViewHolder(View v){
        super(v);
        ButterKnife.bind(this, v);
    }
}
