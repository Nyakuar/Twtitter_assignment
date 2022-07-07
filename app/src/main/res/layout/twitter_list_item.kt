package layout

class twitter_list_item (var twitterList:List<Twitter>):
    RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter=twitterList.get(position)
        holder.tvName.text =currentTwitter.name
        holder.tvUserName.text=currentTwitter.username
        holder.tvRetweet.text=currentTwitter.retweet
        holder.tvlikes.text=currentTwitter.likess
        holder.tvword.text=currentTwitter.word
        holder.tvRetweets.text=currentTwitter.image
        holder.tvReplys.text=currentTwitter.reply
        holder.tvLikes.text=currentTwitter.Likes
    }

    override fun getItemCount(): Int {
        return twitterList.size
    }

}
class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    var tvUserName= itemView.findViewById<TextView>(R.id.tvUserName)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var imglike= itemView.findViewById<ImageView>(R.id.imgLike)
    var tvlikes= itemView.findViewById<TextView>(R.id.tvLikess)
    var imgReplyi= itemView.findViewById<ImageView>(R.id.imgReplyi)
    var imgRetweets= itemView.findViewById<ImageView>(R.id.imgRetweets)
    var tvRetweets= itemView.findViewById<TextView>(R.id.tvRetweets)
    var tvRetweet=itemView.findViewById<TextView>(R.id.tvword)
    var tvword=itemView.findViewById<TextView>(R.id.tvword)
    var tvReplys=itemView.findViewById<TextView>(R.id.tvReplys)
    var tvLikes=itemView.findViewById<TextView>(R.id.tvLikes)




    )