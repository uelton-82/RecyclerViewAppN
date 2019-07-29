package br.senac.sp.l13.recyclerviewappn;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView id_Image;
    public TextView id_Titulo;
    public TextView id_Desc;
    public AppCompatButton btn_link;

    public ViewHolder(View itemView) {
        super(itemView);

        this.id_Image = itemView.findViewById(R.id.id_Image);
        this.id_Titulo = itemView.findViewById(R.id.id_titulo);
        this.id_Desc = itemView.findViewById(R.id.id_desc);
        this.btn_link = itemView.findViewById(R.id.btn_Link);
    }
}
