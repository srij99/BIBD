my.corpus <- Corpus(DirSource("/cloud/project/r-corpus"))
my.corpus <- tm_map(my.corpus,removeWords,stopwords("english"))
my.tdm <- TermDocumentMatrix(my.corpus)
my.dtm <- DocumentTermMatrix(my.corpus, control = list(weighting = weightTfIdf, stopwords = TRUE))

my.df <- as.data.frame(inspect(my.tdm))
my.df.scale <- scale(my.df)

d <- dist(my.df.scale,method = "euclidean")
fit <- hclust(d,method = "ward.D")
plot(fit)

