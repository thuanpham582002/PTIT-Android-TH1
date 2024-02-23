package com.example.javath1.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javath1.R;
import com.example.javath1.model.Gender;
import com.example.javath1.model.Job;

import java.util.List;

public class JobItemAdapter extends RecyclerView.Adapter<JobItemAdapter.JobItemViewHolder> {
    private List<Job> jobs;

    @NonNull
    @Override
    public JobItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new JobItemViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_job_info_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull JobItemViewHolder holder, int position) {
        holder.bind(jobs.get(position));
    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }

    public void setData(List<Job> jobs) {
        this.jobs = jobs;
    }

    public static class JobItemViewHolder extends RecyclerView.ViewHolder {
        View view;
        public JobItemViewHolder(View view) {
            super(view);
            this.view = view;
        }

        public void bind(Job job) {
            ImageView ivAvatar = view.findViewById(R.id.ivGenderAvatar);
            TextView tvName = view.findViewById(R.id.tvJobTitle);
            TextView tvDate = view.findViewById(R.id.tvJobDate);
            switch (job.getGender()) {
                case Female:
                    ivAvatar.setImageResource(R.drawable.ic_female);
                    break;
                case Male:
                    ivAvatar.setImageResource(R.drawable.ic_male);
                    break;
            }

            tvName.setText(job.getName());
            tvDate.setText(job.getDate());
        }
    }
}
