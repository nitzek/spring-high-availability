# spring-high-availability

Small app demonstrating the usage of the org.springframework.cache.annotation.Cacheable annotation in combination with
Hazelcast.

# Explanation

* By adding @EnableCaching to our @SpringBootApplication class we enable regular spring boot caching.
* By adding the hazelcast.yaml and hazelcast-all dependencies to our pom.xml we:
    * Enable Hazelcast to be the caching provider for spring boot
    * Form a cluster with any other discoverable Hazelcast nodes
* Result: Items retrieved from ItemService only need to be resolved once across multiple instances of this application.

# How to use

Easiest way is to just start this application from within your IDE.

Start it multiple times to run various replica's. Change the PORT environment variable every time you start this
service.

The service should be available under localhost:{PORT}/items/{itemName}.

Each time you retrieve the same item from a different replica the reference ID should remain the same.
