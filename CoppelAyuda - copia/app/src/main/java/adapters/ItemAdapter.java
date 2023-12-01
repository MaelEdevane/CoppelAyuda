package com.example.coppelayuda.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.coppelayuda.R;
import com.example.coppelayuda.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> implements Filterable {

    private List<Item> itemList;
    private List<Item> itemListFiltered;
    private OnItemClickListener clickListener;

    // Define la interfaz OnItemClickListener
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    // Método para configurar el oyente
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.clickListener = listener;
    }

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
        this.itemListFiltered = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = itemListFiltered.get(position);
        holder.nameTextView.setText("Nombre: " + item.getName());
        holder.procesoTextView.setText("Proceso: " + item.getProceso());
        holder.rutaTextView.setText("Ruta: " + item.getRuta());
        holder.explicacionTextView.setText("Explicación: " + item.getExplicacion());

        // Configura el clic en el elemento de la vista
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickListener != null) {
                    clickListener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemListFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String query = charSequence.toString().toLowerCase();
                List<Item> filteredList = new ArrayList<>();

                for (Item item : itemList) {
                    if (item.getName().toLowerCase().contains(query)) {
                        filteredList.add(item);
                    }
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                itemListFiltered = (List<Item>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, procesoTextView, rutaTextView, explicacionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            procesoTextView = itemView.findViewById(R.id.procesoTextView);
            rutaTextView = itemView.findViewById(R.id.rutaTextView);
            explicacionTextView = itemView.findViewById(R.id.explicacionTextView);
        }
    }
}
