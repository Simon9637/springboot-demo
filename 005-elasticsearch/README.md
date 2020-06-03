Pulling the image
Obtaining Elasticsearch for Docker is as simple as issuing a docker pull command against the Elastic Docker registry.

docker pull docker.elastic.co/elasticsearch/elasticsearch:7.6.2

Alternatively, you can download other Docker images that contain only features available under the Apache 2.0 license. To download the images, go to www.docker.elastic.co.

Starting a single node cluster with Docker
To start a single-node Elasticsearch cluster for development or testing, specify single-node discovery to bypass the bootstrap checks:

docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.6.2

Submit a _cat/nodes request to see that the nodes are up and running:

	curl -X GET "localhost:9200/_cat/nodes?v&pretty"
