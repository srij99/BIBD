library(textreuse)
minhash <- minhash_generator(200, seed=235)
ats <- TextReuseCorpus(dir="r-corpus", tokenizer=tokenize_ngrams, n=5, minhash_func=minhash)
buckets <- lsh(ats, bands=50, progress=interactive())
candidates <- lsh_candidates(buckets)
scores <- lsh_compare(candidates, ats, jaccard_similarity, progress=FALSE)
scores
color <- c("red","green","blue","orange","yellow","pink")
barplot(as.matrix(scores), col=color)
