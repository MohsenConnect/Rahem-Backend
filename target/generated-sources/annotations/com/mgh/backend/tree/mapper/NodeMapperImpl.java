package com.mgh.backend.tree.mapper;

import com.mgh.backend.tree.domain.dto.NodeResponseDto;
import com.mgh.backend.tree.domain.dto.PartnerSummaryDto;
import com.mgh.backend.tree.domain.entity.Node;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-16T17:41:03+0300",
    comments = "version: 1.6.2, compiler: javac, environment: Java 25 (Oracle Corporation)"
)
@Component
public class NodeMapperImpl implements NodeMapper {

    @Override
    public NodeResponseDto toResponse(Node node) {
        if ( node == null ) {
            return null;
        }

        NodeResponseDto.NodeResponseDtoBuilder nodeResponseDto = NodeResponseDto.builder();

        nodeResponseDto.name( node.getNodeName() );
        nodeResponseDto.id( node.getId() );
        nodeResponseDto.nodeId( node.getNodeId() );
        nodeResponseDto.parentId( node.getParentId() );
        nodeResponseDto.level( node.getLevel() );
        nodeResponseDto.gender( node.getGender() );
        nodeResponseDto.isAlive( node.getIsAlive() );

        return nodeResponseDto.build();
    }

    @Override
    public PartnerSummaryDto toPartnerSummary(Node partner) {
        if ( partner == null ) {
            return null;
        }

        PartnerSummaryDto.PartnerSummaryDtoBuilder partnerSummaryDto = PartnerSummaryDto.builder();

        partnerSummaryDto.id( partner.getNodeId() );
        partnerSummaryDto.name( partner.getNodeName() );

        return partnerSummaryDto.build();
    }
}
