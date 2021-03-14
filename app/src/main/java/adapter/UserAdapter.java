package adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testrandomusers.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import activites.SecondActivity;
import user.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>  {

     private Context context;
     private ArrayList<User> users;

    public UserAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView avatarImageView;
        private TextView randomUserName;


        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            avatarImageView = itemView.findViewById(R.id.avatarImageView);
            randomUserName = itemView.findViewById(R.id.randomUserName);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            User user = users.get(position);
            Intent intent = new Intent(context, SecondActivity.class);
            intent.putExtra("imageAvatar", user.getPhotoURL());
            intent.putExtra("name", user.getName());
            context.startActivity(intent);

        }
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.random_user_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User currentUser = users.get(position);

        String name = currentUser.getName();
        String photoURL = currentUser.getPhotoURL();

        holder.randomUserName.setText(name);
        Picasso.get().load(photoURL).fit().centerInside().into(holder.avatarImageView);


    }

    @Override
    public int getItemCount() {
        return users.size();
    }



}